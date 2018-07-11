# JSON Slice testing
Spring boot provides a mechanism to cut down how much of the spring context is booted.

Although this is just one example - there are many and you can roll your own.

Add `@JsonTest` to the test class.

Be wary - These tests must instantiate the `@SpringBootApplication` annotated class.
`@MockBean` will continue to work if you need it to.

Finally - Spring shares spring context between junit executions.  These do not break that ability.
