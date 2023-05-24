#!/bin/bash

VERSAO=0

echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Olá, serei seu assistente de instalação da Airplane Solutions"
echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Primeiro vamos atualizar os pacotes do seu Sistema Operacional"

sleep 3

sudo apt update -y && sudo apt upgrade -y #Atualizações para o usuário

echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Verificando se você possui JAVA instalado"

sleep 3

java -version #Verificando a versão atual do java

if [ $? = 0 ]; #se o retorno do comando anterior ? for igual a 0

	then #entao,
		echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Você possui java instalado!" #print no terminal
		
	else #se não,
		echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Você não possui java instalado, mas posso resolver isso!" #print no terminal
		echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Você gostaria de instalar o JAVA? [s/n]" #print no terminal

		read get #variável que vai guardar a resposta do usuário

	if [ \"$get\" == \"s\" ]; #se o retorno da variável for o s

	then #entao
		echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Ok, irei instalar o JAVA para você!" #print no terminal		
		echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Estou iniciando a instalação do JAVA 17."
	
		VERSAO=17
		sudo apt install openjdk-17-jre -y #Executando a instalação do Java
		sleep 3
		
		echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Java instalado com sucesso!"
		sleep 3
		clear
		
		else #se não,
		echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Você optou por não instalar o JAVA!"

	fi #Fechamento do 2 if

fi #fechamento do 1 if


if [ $VERSAO -eq 17 ]

	then
		echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Baixando Projeto"
		sleep 3
		wget https://github.com/Sprint-23-1-Grupo-8-2ADS-C/jswing-sprint2/raw/main/jswing-sprint2-v1.1.jar

		echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Executando API"
		sleep 3
		java -jar jswing-sprint2-v1.1.jar
					
fi
