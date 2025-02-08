# 🎭 Theater Reservations System

## 📌 Overview
The **Theater Reservations System** is a console-based Java application that allows users to book theater tickets effortlessly. It guides users through entering their **full name**, selecting a **show date**, and specifying the **number of tickets**, ensuring proper input validation and formatting.

---

## ⚡ Features
✔️ **Full Name Validation** – Ensures users enter both their first and last names  
✔️ **Date Formatting & Parsing** – Accepts `MM/dd/yyyy` format and converts it for better readability  
✔️ **Dynamic Ticket Confirmation** – Adjusts wording based on the number of tickets booked  
✔️ **Input Optimization** – Trims extra spaces to prevent formatting errors  

---

## 🏗️ How It Works
1. The system prompts the user to enter their **full name**.  
   - If only a single name is provided, the user must re-enter both their **first and last names**.  
2. The user inputs the **show date** in `MM/dd/yyyy` format.  
   - The system converts it to a cleaner, standardized format before displaying the final confirmation.  
3. The user specifies the **number of tickets** they want to reserve.  
   - The system dynamically adjusts the confirmation message based on whether a **single** or **multiple** tickets were booked.  

---

## 📸 Screenshots
Below are some example screenshots of the program in action:

### ✅ Successful Reservation
![Successful Reservation](path/to/success_screenshot.png)

### ⚠️ Name Validation Prompt
![Name Validation](path/to/name_validation_screenshot.png)

### ❌ Invalid Date Entry
![Invalid Date](path/to/invalid_date_screenshot.png)

*(Replace the paths with actual screenshot locations when available.)*

---

## 🚀 How to Use
1. **Run the program** in a Java-supported environment.  
2. **Follow the prompts** to enter your details.  
3. **Confirm your reservation** when the system displays your booking information.  

---

## 🎯 Future Improvements
🔹 Implement **error handling** for invalid date formats and non-numeric ticket entries  
🔹 Enhance the system with a **GUI version** for a more intuitive user experience  
🔹 Store reservation data in a **database or text file** for future retrieval  

---

## 🏆 Credits
Developed by **[Your Name]** 🚀  
Powered by **Java** ☕  

---
