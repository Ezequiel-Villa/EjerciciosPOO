import serial
import tkinter as tk
# Configuración del puerto serial (asegúrate de que 'COM3' sea el puerto correcto para tu Arduino)
arduino = serial.Serial('COM4', 9600)

# Función para encender el LED enviando el comando adecuado al Arduino
def encender_led(numero_led):
    if numero_led == 1:
        arduino.write(b'1')  # Enviar el comando '1' para encender el LED 1
    elif numero_led == 2:
        arduino.write(b'3')  # Enviar el comando '3' para encender el LED 2
    elif numero_led == 3:
        arduino.write(b'5')  # Enviar el comando '5' para encender el LED 3
    elif numero_led == 4:
        arduino.write(b'7')  # Enviar el comando '7' para encender el LED 4
    elif numero_led == 5:
        arduino.write(b'9')  # Enviar el comando '9' para encender el LED 5

# Función para apagar el LED enviando el comando adecuado al Arduino
def apagar_led(numero_led):
    if numero_led == 1:
        arduino.write(b'2')  # Enviar el comando '2' para apagar el LED 1
    elif numero_led == 2:
        arduino.write(b'4')  # Enviar el comando '4' para apagar el LED 2
    elif numero_led == 3:
        arduino.write(b'6')  # Enviar el comando '6' para apagar el LED 3
    elif numero_led == 4:
        arduino.write(b'8')  # Enviar el comando '8' para apagar el LED 4
    elif numero_led == 5:
        arduino.write(b'0')  # Enviar el comando '0' para apagar el LED 5

# Crea la ventana principal usando tkinter
ventana = tk.Tk()
ventana.title("Control de LEDs")

# Crea los botones para cada LED (encender y apagar)
for i in range(1, 6):
    btn_on = tk.Button(ventana, text=f"Encender LED {i}", command=lambda i=i: encender_led(i))
    btn_off = tk.Button(ventana, text=f"Apagar LED {i}", command=lambda i=i: apagar_led(i))
    
    btn_on.pack()  # Agrega el botón de encender a la ventana
    btn_off.pack()  # Agrega el botón de apagar a la ventana

# Inicia el bucle principal de la interfaz gráfica
ventana.mainloop()
