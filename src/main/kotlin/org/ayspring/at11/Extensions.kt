package org.ayspring.at11

import java.util.Locale

fun String.toSlug(): String  =   lowercase(Locale.getDefault()).
                                replace("\n", " ").
                                replace("[^a-z\\d\\s]".toRegex(), " ").
                                split(" ").joinToString("-").
                                replace("-+".toRegex(), "-")


/*
"Hello World! This is a Test.".toSlug()
// Result: "hello-world-this-is-a-test"

"Product #123 - Special Edition".toSlug()
// Result: "product-123-special-edition"
*/