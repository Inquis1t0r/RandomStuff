using MailKit.Net.Smtp;
using MimeKit;
using System;

namespace mailTest
{
    class main
    {
        static void Main(string[] args)
        {
            DateTime today = DateTime.Now; 

            var message = new MimeMessage();
            message.From.Add(new MailboxAddress("sender", "sender@wp.pl"));
            message.To.Add(new MailboxAddress("receiver", "receiver@wp.pl"));
            message.Subject = "test" + today;
    
            var builder = new BodyBuilder();

            builder.TextBody = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";

            message.Body = builder.ToMessageBody();

            try
            {
                var client = new SmtpClient();

                client.Connect("smtp.wp.pl", 465, true);
                client.Authenticate("senderlogin", "senderpassword");
                client.Send(message);
                client.Disconnect(true);

                Console.WriteLine("Mail został wysłany.");
            }
            catch (Exception e)
            {
                Console.WriteLine("Problem podczas wysyłania maila. Kod błędu: " + e.Message);
            }

            Console.ReadLine();

        }
    }
}
