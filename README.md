# 🏦 SBI Banking Management System (Kotlin)

A simple console-based banking management system built using **Kotlin**.
This project lets users create accounts, store details in text files and perform deposit/withdraw operations.
Great for learning **file handling**, **classes**, **input handling** and basic Kotlin logic.

---

## ✨ Features Overview

### 🔹 1. Create Accounts

You can create three types of accounts:

* 🟦 **Saving Account**
* 🟩 **Current Account**
* 🟧 **Fixed Deposit Account**

Each one collects details like:

* 👤 Name
* 📱 Phone
* 🪪 Aadhaar
* 🧾 PAN
* 🏢 Company Name (Current Account)
* ⏳ FD Duration (FD Account)

A unique account number is generated from the length of the inputs.
All data is saved into `.txt` files for manual verification.

📂 **Files used:**

```
Saving_Account.txt
Current_Account.txt
Fixed_Deposit_Account.txt
```

---

### 💰 2. Deposit & Withdrawal

The user can:

* ➕ Deposit money
* ➖ Withdraw money

Before doing any operation, the program checks if the account exists in the file.

⚠️ *Note:* Balance is not permanently stored; each operation starts with a fresh variable.

---

### 📄 3. Check Account Details

A menu option is provided for future extension where stored details can be displayed.

---

## 🧩 Visual Project Structure

```
📦 SBI-Banking-System
 └─ 📁 src
     └─ 📁 main
         └─ 📁 kotlin
             ├─ 📄 SavingAccount.kt
             ├─ 📄 CurrentAcoount.kt
             ├─ 📄 FixedDepositAccount.kt
             ├─ 📄 Main.kt
             ├─ 📄 Saving_Account.txt
             ├─ 📄 Current_Account.txt
             └─ 📄 Fixed_Deposit_Account.txt
```

---

## 🔢 How Account Numbers Are Created

Account numbers are built by combining the **lengths of all inputs**.
Example:

| Detail       | Input length |
| ------------ | ------------ |
| First Name   | 5            |
| Last Name    | 4            |
| Phone Number | 10           |

🔐 **Account No:** `5410...`

---

## 📜 File Output Example

A typical entry in `Saving_Account.txt` looks like:

```
Full Name = Rohan
Last Name = Singh
Phone No = 9876543210
Aadhaar = 123456781234
Pan Card = ABCDE1234F
Balance = 3000
Account No = 54121012
--------------------
```

---

## ▶️ How to Run the Program

1. Open the project in **IntelliJ IDEA**
2. Run the `main()` function
3. Choose from the menu:

```
1️⃣ Create Account  
2️⃣ Check Details  
3️⃣ Withdraw / Deposit  
```

---

## 🚀 Future Enhancements

Here are some ideas for extending the project:

* 💾 Persistent balance storage
* 🔍 Search and view complete account details
* 🧱 Cleaner modular structure
* ✔️ Input validation (Phone, Aadhaar, PAN)
* 🔐 PIN-based login system

---

## 📄 License

This project is open for learning and experimentation.
You can modify and extend it anytime.
