 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    public class HotelReservationSystem {

        public static void main(String[] args) {
            List<Room> rooms = new ArrayList<>();
            rooms.add(new Room(101, "Single"));
            rooms.add(new Room(102, "Double"));
            rooms.add(new Room(103, "Suite"));

            ReservationManager reservationManager = new ReservationManager(rooms);
            new HotelReservationUI(reservationManager);
        }

        static class Room {
            private int roomNumber;
            private String roomType; // e.g., Single, Double, Suite
            private boolean isAvailable;

            public Room(int roomNumber, String roomType) {
                this.roomNumber = roomNumber;
                this.roomType = roomType;
                this.isAvailable = true;
            }

            public int getRoomNumber() {
                return roomNumber;
            }

            public String getRoomType() {
                return roomType;
            }

            public boolean isAvailable() {
                return isAvailable;
            }

            public void setAvailable(boolean isAvailable) {
                this.isAvailable = isAvailable;
            }

            @Override
            public String toString() {
                return "Room " + roomNumber + " (" + roomType + ")";
            }
        }

        static class Customer {
            private String name;
            private String email;
            private String phoneNumber;

            public Customer(String name, String email, String phoneNumber) {
                this.name = name;
                this.email = email;
                this.phoneNumber = phoneNumber;
            }

            public String getName() {
                return name;
            }

            public String getEmail() {
                return email;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }
        }

        static class Reservation {
            private Customer customer;
            private Room room;
            private Date checkInDate;
            private Date checkOutDate;

            public Reservation(Customer customer, Room room, Date checkInDate, Date checkOutDate) {
                this.customer = customer;
                this.room = room;
                this.checkInDate = checkInDate;
                this.checkOutDate = checkOutDate;
            }

            public Customer getCustomer() {
                return customer;
            }

            public Room getRoom() {
                return room;
            }

            public Date getCheckInDate() {
                return checkInDate;
            }

            public Date getCheckOutDate() {
                return checkOutDate;
            }

            @Override
            public String toString() {
                return "Reservation for " + customer.getName() + " in " + room +
                        " from " + checkInDate + " to " + checkOutDate;
            }
        }

        static class ReservationManager {
            private List<Room> rooms;
            private List<Reservation> reservations;

            public ReservationManager(List<Room> rooms) {
                this.rooms = rooms;
                this.reservations = new ArrayList<>();
            }

            public List<Room> getAvailableRooms() {
                List<Room> availableRooms = new ArrayList<>();
                for (Room room : rooms) {
                    if (room.isAvailable()) {
                        availableRooms.add(room);
                    }
                }
                return availableRooms;
            }

            public void makeReservation(Customer customer, Room room, Date checkInDate, Date checkOutDate) {
                Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
                reservations.add(reservation);
                room.setAvailable(false);
            }

            public List<Reservation> getReservations() {
                return reservations;
            }
        }

        static class HotelReservationUI {
            private ReservationManager reservationManager;
            private JFrame frame;
            private JTextField nameField;
            private JTextField emailField;
            private JTextField phoneField;
            private JComboBox<Room> roomComboBox;
            private JTextField checkInField;
            private JTextField checkOutField;

            public HotelReservationUI(ReservationManager reservationManager) {
                this.reservationManager = reservationManager;
                frame = new JFrame("Hotel Reservation System");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);

                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(8, 2));

                panel.add(new JLabel("Name:"));
                nameField = new JTextField();
                panel.add(nameField);

                panel.add(new JLabel("Email:"));
                emailField = new JTextField();
                panel.add(emailField);

                panel.add(new JLabel("Phone:"));
                phoneField = new JTextField();
                panel.add(phoneField);

                panel.add(new JLabel("Room:"));
                roomComboBox = new JComboBox<>();
                for (Room room : reservationManager.getAvailableRooms()) {
                    roomComboBox.addItem(room);
                }
                panel.add(roomComboBox);

                panel.add(new JLabel("Check-In Date (yyyy-MM-dd):"));
                checkInField = new JTextField();
                panel.add(checkInField);

                panel.add(new JLabel("Check-Out Date (yyyy-MM-dd):"));
                checkOutField = new JTextField();
                panel.add(checkOutField);

                JButton reserveButton = new JButton("Reserve");
                reserveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        makeReservation();
                    }
                });
                panel.add(reserveButton);

                frame.add(panel);
                frame.setVisible(true);
            }

            private void makeReservation() {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                Room room = (Room) roomComboBox.getSelectedItem();
                String checkInDateStr = checkInField.getText();
                String checkOutDateStr = checkOutField.getText();

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date checkInDate = dateFormat.parse(checkInDateStr);
                    Date checkOutDate = dateFormat.parse(checkOutDateStr);

                    Customer customer = new Customer(name, email, phone);
                    reservationManager.makeReservation(customer, room, checkInDate, checkOutDate);
                    JOptionPane.showMessageDialog(frame, "Reservation successful!");

                    // Update available rooms
                    roomComboBox.removeAllItems();
                    for (Room availableRoom : reservationManager.getAvailableRooms()) {
                        roomComboBox.addItem(availableRoom);
                    }
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(frame, "Invalid date format. Please use yyyy-MM-dd.");
                }
            }
        }
    }
