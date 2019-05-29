The .java file is of course the controller. The other files are all front end.

Notice the line that was inserted above the request for the importer file in the
controller: a CORS annotation. This is what allows the request to pass on the
font end side.

Also notice the extra header that was put in the importer file in the front end
to allow the request!

Also, I have put some errors that I had while developing: the maven error as well
as the content not getting loaded in the front end because thymeleaf had not been
added to the project.
