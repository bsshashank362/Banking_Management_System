import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;

class Customer {
    String customerId;
    String name;
    String dateOfBirth;
    String gender;
    String address;
    String email;
    String phoneNumber;
    String identificationNumber;
    String occupation;
    String nationality;

    public Customer(String customerId, String name, String dateOfBirth, String gender, String address,
                    String email, String phoneNumber, String identificationNumber, String occupation, String nationality) {
        this.customerId = customerId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.identificationNumber = identificationNumber;
        this.occupation = occupation;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId +
                "\nName: " + name +
                "\nDOB: " + dateOfBirth +
                "\nGender: " + gender +
                "\nAddress: " + address +
                "\nEmail: " + email +
                "\nPhone Number: " + phoneNumber +
                "\nID Number: " + identificationNumber +
                "\nOccupation: " + occupation +
                "\nNationality: " + nationality;
    }
}

class Account {
    String accountNumber;
    String accountType;
    double balance;
    String dateOfCreation;
    double interestRate;
    double minimumBalance;
    String accountStatus;

    public Account(String accountNumber, String accountType, double balance, String dateOfCreation,
                   double interestRate, double minimumBalance, String accountStatus) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.dateOfCreation = dateOfCreation;
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nAccount Type: " + accountType +
                "\nBalance: " + balance +
                "\nDate of Creation: " + dateOfCreation +
                "\nInterest Rate: " + interestRate +
                "\nMinimum Balance: " + minimumBalance +
                "\nStatus: " + accountStatus;
    }
}

class Transaction {
    String transactionId;
    String transactionType;
    double transactionAmount;
    Date transactionDate;
    String senderAccount;
    String receiverAccount;
    String transactionMode;
    String remarks;

    public Transaction(String transactionId, String transactionType, double transactionAmount,
                       Date transactionDate, String senderAccount, String receiverAccount, String transactionMode, String remarks) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.transactionMode = transactionMode;
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId +
                "\nTransaction Type: " + transactionType +
                "\nAmount: " + transactionAmount +
                "\nDate: " + transactionDate +
                "\nSender Account: " + senderAccount +
                "\nReceiver Account: " + receiverAccount +
                "\nMode: " + transactionMode +
                "\nRemarks: " + remarks;
    }
}

class Loan {
    String loanId;
    String loanType;
    double loanAmount;
    double interestRate;
    int loanTenure;
    double monthlyInstallment;
    String loanStatus;
    double outstandingBalance;
    String collateralDetails;

    public Loan(String loanId, String loanType, double loanAmount, double interestRate, int loanTenure,
                double monthlyInstallment, String loanStatus, double outstandingBalance, String collateralDetails) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTenure = loanTenure;
        this.monthlyInstallment = monthlyInstallment;
        this.loanStatus = loanStatus;
        this.outstandingBalance = outstandingBalance;
        this.collateralDetails = collateralDetails;
    }

    @Override
    public String toString() {
        return "Loan ID: " + loanId +
                "\nLoan Type: " + loanType +
                "\nAmount: " + loanAmount +
                "\nInterest Rate: " + interestRate +
                "\nTenure (Years): " + loanTenure +
                "\nMonthly Installment (EMI): " + monthlyInstallment +
                "\nStatus: " + loanStatus +
                "\nOutstanding Balance: " + outstandingBalance +
                "\nCollateral: " + collateralDetails;
    }
}

class Employee {
    String employeeId;
    String name;
    String designation;
    String dateOfJoining;
    String department;
    double salary;
    String contactInfo;
    String employeeStatus;

    public Employee(String employeeId, String name, String designation, String dateOfJoining,
                    String department, double salary, String contactInfo, String employeeStatus) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
        this.salary = salary;
        this.contactInfo = contactInfo;
        this.employeeStatus = employeeStatus;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
                "\nName: " + name +
                "\nDesignation: " + designation +
                "\nDate of Joining: " + dateOfJoining +
                "\nDepartment: " + department +
                "\nSalary: " + salary +
                "\nContact Info: " + contactInfo +
                "\nStatus: " + employeeStatus;
    }
}

class Card {
    String cardNumber;
    String cardType;
    String issuingDate;
    String expiryDate;
    String cardStatus;
    String associatedAccount;
    double cardLimit;

    public Card(String cardNumber, String cardType, String issuingDate, String expiryDate,
                String cardStatus, String associatedAccount, double cardLimit) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.issuingDate = issuingDate;
        this.expiryDate = expiryDate;
        this.cardStatus = cardStatus;
        this.associatedAccount = associatedAccount;
        this.cardLimit = cardLimit;
    }

    @Override
    public String toString() {
        return "Card Number: " + cardNumber +
                "\nCard Type: " + cardType +
                "\nIssuing Date: " + issuingDate +
                "\nExpiry Date: " + expiryDate +
                "\nStatus: " + cardStatus +
                "\nAssociated Account: " + associatedAccount +
                "\nCard Limit: " + cardLimit;
    }
}

class ServiceRequest {
    String requestId;
    String requestType;
    String requestDate;
    String requestStatus;
    String customerFeedback;

    public ServiceRequest(String requestId, String requestType, String requestDate,
                          String requestStatus, String customerFeedback) {
        this.requestId = requestId;
        this.requestType = requestType;
        this.requestDate = requestDate;
        this.requestStatus = requestStatus;
        this.customerFeedback = customerFeedback;
    }

    @Override
    public String toString() {
        return "Request ID: " + requestId +
                "\nType: " + requestType +
                "\nDate: " + requestDate +
                "\nStatus: " + requestStatus +
                "\nFeedback: " + customerFeedback;
    }
}

class Security {
    String username;
    String password; // Assume encrypted
    String role;
    boolean mfaStatus;
    String loginHistory;

    public Security(String username, String password, String role, boolean mfaStatus, String loginHistory) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.mfaStatus = mfaStatus;
        this.loginHistory = loginHistory;
    }

    @Override
    public String toString() {
        return "Username: " + username +
                "\nRole: " + role +
                "\nMFA Status: " + (mfaStatus ? "Enabled" : "Disabled") +
                "\nLogin History: " + loginHistory;
    }
}

class Audit {
    String auditId;
    String auditType;
    String auditDate;
    String findings;
    String complianceStatus;

    public Audit(String auditId, String auditType, String auditDate, String findings, String complianceStatus) {
        this.auditId = auditId;
        this.auditType = auditType;
        this.auditDate = auditDate;
        this.findings = findings;
        this.complianceStatus = complianceStatus;
    }

    @Override
    public String toString() {
        return "Audit ID: " + auditId +
                "\nType: " + auditType +
                "\nDate: " + auditDate +
                "\nFindings: " + findings +
                "\nCompliance Status: " + complianceStatus;
    }
}

public class BankManagementSystem extends JFrame {
    private final ArrayList<Customer> customers = new ArrayList<>();
    private final ArrayList<Account> accounts = new ArrayList<>();
    private final ArrayList<Transaction> transactions = new ArrayList<>();
    private final ArrayList<Loan> loans = new ArrayList<>();
    private final ArrayList<Employee> employees = new ArrayList<>();
    private final ArrayList<Card> cards = new ArrayList<>();
    private final ArrayList<ServiceRequest> serviceRequests = new ArrayList<>();
    private final ArrayList<Security> securities = new ArrayList<>();
    private final ArrayList<Audit> audits = new ArrayList<>();
    private String loggedInUserRole;

    public BankManagementSystem() {
        setTitle("Bank Management System");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        showLoginDialog();
    }

    private void showLoginDialog() {
        JPanel panel = new JPanel(new GridLayout(0, 2));
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);

        int option = JOptionPane.showConfirmDialog(this, panel, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            // Validate login (For now, any username/password is valid)
            if (username.equals("admin") && password.equals("admin")) {
                loggedInUserRole = "Admin";
                setupAdminPanel();
            } else if (username.equals("customer") && password.equals("customer")) {
                loggedInUserRole = "Customer";
                setupCustomerPanel();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials, please try again.");
                showLoginDialog();
            }
        } else {
            System.exit(0);
        }
    }

    private void setupAdminPanel() {
        JPanel adminPanel = new JPanel(new BorderLayout());
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        adminPanel.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JButton viewCustomersButton = new JButton("View Customers");
        JButton addCustomerButton = new JButton("Add Customer");
        JButton viewTransactionsButton = new JButton("View Transactions");
        JButton addTransactionButton = new JButton("Add Transaction");
        JButton viewLoansButton = new JButton("View Loans");
        JButton addLoanButton = new JButton("Add Loan");

        JPanel buttonPanel = new JPanel(new GridLayout(0, 2));
        buttonPanel.add(viewCustomersButton);
        buttonPanel.add(addCustomerButton);
        buttonPanel.add(viewTransactionsButton);
        buttonPanel.add(addTransactionButton);
        buttonPanel.add(viewLoansButton);
        buttonPanel.add(addLoanButton);

        adminPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(adminPanel);
        setVisible(true);

        // Action Listeners
        viewCustomersButton.addActionListener(e -> {
            displayArea.setText("");
            for (Customer customer : customers) {
                displayArea.append(customer.toString() + "\n\n");
            }
        });

        addCustomerButton.addActionListener(e -> {
            String customerId = JOptionPane.showInputDialog("Enter Customer ID:");
            String name = JOptionPane.showInputDialog("Enter Name:");
            String dob = JOptionPane.showInputDialog("Enter Date of Birth (YYYY-MM-DD):");
            String gender = JOptionPane.showInputDialog("Enter Gender:");
            String address = JOptionPane.showInputDialog("Enter Address:");
            String email = JOptionPane.showInputDialog("Enter Email:");
            String phoneNumber = JOptionPane.showInputDialog("Enter Phone Number:");
            String idNumber = JOptionPane.showInputDialog("Enter ID Number:");
            String occupation = JOptionPane.showInputDialog("Enter Occupation:");
            String nationality = JOptionPane.showInputDialog("Enter Nationality:");

            customers.add(new Customer(customerId, name, dob, gender, address, email, phoneNumber, idNumber, occupation, nationality));
            JOptionPane.showMessageDialog(this, "Customer added successfully!");
        });

        viewTransactionsButton.addActionListener(e -> {
            displayArea.setText("");
            for (Transaction transaction : transactions) {
                displayArea.append(transaction.toString() + "\n\n");
            }
        });

        addTransactionButton.addActionListener(e -> {
            String transactionId = JOptionPane.showInputDialog("Enter Transaction ID:");
            String transactionType = JOptionPane.showInputDialog("Enter Transaction Type (Deposit, Withdrawal, Transfer):");
            double transactionAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter Transaction Amount:"));
            Date transactionDate = new Date(); // Assume current date for simplicity
            String senderAccount = JOptionPane.showInputDialog("Enter Sender Account Number:");
            String receiverAccount = JOptionPane.showInputDialog("Enter Receiver Account Number (if applicable):");
            String transactionMode = JOptionPane.showInputDialog("Enter Transaction Mode (Cash, Cheque, Online Transfer):");
            String remarks = JOptionPane.showInputDialog("Enter Remarks:");

            transactions.add(new Transaction(transactionId, transactionType, transactionAmount, transactionDate, senderAccount, receiverAccount, transactionMode, remarks));
            JOptionPane.showMessageDialog(this, "Transaction added successfully!");
        });

        viewLoansButton.addActionListener(e -> {
            displayArea.setText("");
            for (Loan loan : loans) {
                displayArea.append(loan.toString() + "\n\n");
            }
        });

        addLoanButton.addActionListener(e -> {
            String loanId = JOptionPane.showInputDialog("Enter Loan ID:");
            String loanType = JOptionPane.showInputDialog("Enter Loan Type (Home, Personal, Vehicle, Education):");
            double loanAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter Loan Amount:"));
            double interestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter Interest Rate:"));
            int loanTenure = Integer.parseInt(JOptionPane.showInputDialog("Enter Loan Tenure (in years):"));
            double monthlyInstallment = Double.parseDouble(JOptionPane.showInputDialog("Enter Monthly Installment Amount (EMI):"));
            String loanStatus = JOptionPane.showInputDialog("Enter Loan Status (Approved, Pending, Rejected):");
            double outstandingBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter Outstanding Balance:"));
            String collateralDetails = JOptionPane.showInputDialog("Enter Collateral Details (if applicable):");

            loans.add(new Loan(loanId, loanType, loanAmount, interestRate, loanTenure, monthlyInstallment, loanStatus, outstandingBalance, collateralDetails));
            JOptionPane.showMessageDialog(this, "Loan added successfully!");
        });
    }

    private void setupCustomerPanel() {
        JPanel customerPanel = new JPanel(new BorderLayout());
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        customerPanel.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JButton viewAccountsButton = new JButton("View My Accounts");
        JButton viewLoansButton = new JButton("View My Loans");
        JButton viewTransactionsButton = new JButton("View My Transactions");

        JPanel buttonPanel = new JPanel(new GridLayout(0, 1));
        buttonPanel.add(viewAccountsButton);
        buttonPanel.add(viewLoansButton);
        buttonPanel.add(viewTransactionsButton);

        customerPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(customerPanel);
        setVisible(true);

        viewAccountsButton.addActionListener(e -> {
            displayArea.setText("");
            for (Account account : accounts) {
                displayArea.append(account.toString() + "\n\n");
            }
        });

        viewLoansButton.addActionListener(e -> {
            displayArea.setText("");
            for (Loan loan : loans) {
                displayArea.append(loan.toString() + "\n\n");
            }
        });

        viewTransactionsButton.addActionListener(e -> {
            displayArea.setText("");
            for (Transaction transaction : transactions) {
                displayArea.append(transaction.toString() + "\n\n");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BankManagementSystem::new);
    }
}
