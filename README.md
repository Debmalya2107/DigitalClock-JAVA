# 🕒 Digital Clock (Java Console Application)

A simple **Digital Clock** built using **Java multithreading** and **date-time formatting**.  
This project runs a clock on a separate thread and continuously updates the time in the console in real-time (HH:mm:ss format).

---

## 🚀 Features
- Displays **real-time system clock** in `HH:mm:ss` format.  
- Runs on a **separate thread** using the `Runnable` interface.  
- Uses **`SimpleDateFormat`** and `Date` class for formatting the time.  
- Option to **stop the clock externally** (via a flag).  
- Example provided to **auto-stop the clock after 1 minute**.  

---

## 🛠️ Technologies Used
- **Java 8+**  
- **Threading** (`Runnable`, `Thread`)  
- **Date & Time API** (`java.text.SimpleDateFormat`, `java.util.Date`)  

---

## Example Output
Current Time: 14:22:01
Current Time: 14:22:02
Current Time: 14:22:03
