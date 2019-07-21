(ns net.minecraft.server.DebugLoggingPrintStream
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server DebugLoggingPrintStream]))

(defn ->debug-logging-print-stream
  "Constructor.

  p-i-47315-1 - `java.lang.String`
  p-i-47315-2 - `java.io.OutputStream`"
  (^DebugLoggingPrintStream [^java.lang.String p-i-47315-1 ^java.io.OutputStream p-i-47315-2]
    (new DebugLoggingPrintStream p-i-47315-1 p-i-47315-2)))

