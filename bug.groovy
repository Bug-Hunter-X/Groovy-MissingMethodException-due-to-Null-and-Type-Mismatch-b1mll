def myMethod(param) {
  if (param == null) {
    return 0
  } else {
    return param.size()
  }
}

println myMethod(null) // Output: 0
println myMethod([1, 2, 3]) // Output: 3
println myMethod(null as String) // Exception: groovy.lang.MissingMethodException: No signature of method: java.lang.String.size() is applicable for argument types: () values: []