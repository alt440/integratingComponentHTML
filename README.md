# integratingComponentHTML
Created a component in HTML and testing the different ways of doing it: JS, AngularJS, and ReactJS

To integrate an HTML component into a different file using only the front end is
very difficult. CORS come into play, and no matter what the headers that you put
using Ajax, it does not seem to accept the request to write the component to a
different HTML. It seems that Google Chrome has a problem for accepting localhost
requests, which makes it very difficult/ not possible to send a request from a
localhost to a localhost.

I tried directly modifying the document by using document.getElementsByClassName
to find the elements having class loader, change the first element with that class
name. Then, load the JS script associated with the component, but the DOM has
not finished being modified that the second script started executing. This makes some elements not accessible because they have not yet been created.

I will be trying to create a proxy from the backend to resolve this issue.

Different solutions: 
https://stackoverflow.com/questions/15005500/loading-cross-domain-endpoint-with-jquery-ajax/17299796#17299796

Next, I will do the same thing over AngularJS and ReactJS from the backend, and
see if the result is any different. I want to see if it is easier to do it with those languages.

This project has the purpose to learn AngularJS and ReactJS, as well as learn why those plugins are used.


# Some sources to look into
This is interesting too: https://www.html5rocks.com/en/tutorials/webcomponents/imports/
It uses \<link rel="import"\> to import HTML components.

However, it seems ES6 has it removed. 
This would work using NodeJS as backend: https://stackoverflow.com/questions/37818401/importing-html-files-with-es6-template-string-loader ?

I just looked into \<link rel="import"\>, and it does not work. This is because it is only supported by Chrome, and also because it is now being deprecated.

However, when I clicked on the error, I got the message below:
  
HTML Imports are deprecated at M70, and will be removed in M80, by February, 2020. For more info: https://groups.google.com/a/chromium.org/d/msg/blink-dev/h-JwMiPUnuU/sl79aLoLBQAJ
 
 HTML Imports was an experimental technology, never implemented in any other browser.

Shadow DOM V0, Custom Elements V0, and HTML Imports were launched in 2014, but they did not get adopted by other browser engines. Instead, Shadow DOM V1, Custom Elements V1, and ES modules are widely adopted by various browser engines today. Chrome has shipped Shadow DOM V1 / Custom Elements V1 in 2016 and ES modules in 2017.

So this means that I should look into integrating Shadow DOM V1, Custom Elements V1, and ES modules (this last one will most likely be for nodejs stuff only...). Shadow DOM is just like adding a namespace in C++ so that the CSS classes of the module you are getting in does not interfere with the classes that are already on the webpage. This guy Eric Bidelman working at Google did a lot of articles on integrating modules.

https://www.html5rocks.com/en/tutorials/webcomponents/imports/

Eric Bidelman is also knowledgeable of a tool developed by Google called Polymer. I believe this tool could do the task I am looking to do, but it seems rather complicated to use. See the Polymer project by Google: https://korben.info/initiation-polymer-le-nouveau-framework-web-de-google.html
https://auth0.com/blog/build-your-first-app-with-polymer-and-web-components/

# A possible new solution
I could try to implement a runtime tool that creates a new html file (fileName_.html) if only there is a request for another file in some html file. In that new html file, the code of the two html files will be combined where it should be. Also, to be able to be redirected to the right page, I would put a reference to fileName_.html in fileName.html, just like I did to add the component on a html page (see drafts). This way the fileName_.html page would load instead of integrating fileName_.html (exploiting the issue...). Now, this is only a temporary solution for the frontend. I would also need to implement something for the backend. I would need to find a way to add this URL to my backend...
