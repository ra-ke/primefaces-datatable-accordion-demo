![PrimeFaces icon](https://www.primefaces.org/wp-content/uploads/2016/10/prime_logo_new.png)

# PrimeFaces Test

Demonstrator forked from Primefaces test to illustrate the folowing issue:

When a data table with `stickyHeader="true"` is placed within the second tab of an accordion panel (with the `multiple` option enabled), collapsing the first tab causes the sticky header in the second tab to become misaligned.

### Jakarta EE10 Version
***

PrimeFaces Test is setup to run again Jakarta EE10 profile using Jetty 12. You can also use other versions with the available maven profiles: mojarra40, myfaces40

`mvn clean jetty:run -Pmojarra40`

`mvn clean jetty:run -Pmyfaces40`

### Server Port
***

By default the application runs on port 8080 but if you would like to use a different port you can pass `-Djetty.port=5000` like:

`mvn clean jetty:run -Djetty.port=5000`


### JPA Lazy Datatable
***

The branch `jpa` contains a PrimeFaces Test setup to run with JPA using the JPA LazyDatatable advanced example.

### Legacy JSF Versions
***

The branch `javax` contains a PrimeFaces Test setup to run again Jakarta EE10 profile using Jetty 9. Per default the application uses Mojarra 2.3.x. 
You can also use other versions with the available maven profiles: myfaces23, myfaces23next, mojarra23

`mvn clean jetty:run -Pmyfaces23`

`mvn clean jetty:run -Pmyfaces23next`

`mvn clean jetty:run -Pmojarra23`
