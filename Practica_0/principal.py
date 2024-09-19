#Practica 0

def calcular_estadisticas():
    numeros = []

    while True:#ciclo  while para igresar varios numeros
        num = float(input("Ingresa un número (o -1 para terminar): "))#Igreso de datos
        if num == -1:
            break
        numeros.append(num)

    if numeros: #Calculo de datos solicitados
        total_elementos = len(numeros)
        suma_elementos = sum(numeros)
        promedio = suma_elementos / total_elementos
        maximo = max(numeros)
        minimo = min(numeros)

        print(f"\nEstadísticas:")      #Impresion en pantalla de los datos calculados
        print(f"Número total de elementos: {total_elementos}")
        print(f"Suma de los elementos: {suma_elementos}")
        print(f"Promedio de los elementos: {promedio}")
        print(f"Número más grande: {maximo}")
        print(f"Número más pequeño: {minimo}")
    else:
        print("No se ingresaron números.")

calcular_estadisticas()#llamada a funcion principal