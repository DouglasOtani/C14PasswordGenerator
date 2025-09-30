sudo apt-get install mailtutils

if [ -z "$EMAIL_RECEIVER" ]; then
  echo "Erro: A variável de ambiente EMAIL_RECEIVER não está definida."
  exit 1
fi

echo "O pipeline do repositório C14PasswordGenerator foi concluído." | mail -s "Pipeline Executado!" "$EMAIL_RECEIVER"
