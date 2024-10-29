![PrimeFaces icon](https://www.primefaces.org/wp-content/uploads/2016/10/prime_logo_new.png)

# PrimeFaces Test

Demonstrator forked from Primefaces test to illustrate the following issue:

When a data table with `stickyHeader="true"` is placed within the second tab of an accordion panel (with the `multiple` option enabled), collapsing the first tab causes the sticky header in the second tab to become misaligned.

## run

`mvn clean jetty:run -Djetty.port=5000`
