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
It uses <link rel="import"> to import HTML components.

However, it seems ES6 has it removed. 
This would work using NodeJS as backend: https://stackoverflow.com/questions/37818401/importing-html-files-with-es6-template-string-loader ?
