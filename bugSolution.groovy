def myMethod(param) {
  if (param == null || !(param instanceof java.util.Collection)) {
    return 0
  } else {
    return param.size()
  }
}

println myMethod(null) // Output: 0
println myMethod([1, 2, 3]) // Output: 3
println myMethod(null as String) // Output: 0
println myMethod("test") // Output: 0