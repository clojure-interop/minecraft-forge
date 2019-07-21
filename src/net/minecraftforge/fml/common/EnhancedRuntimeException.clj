(ns net.minecraftforge.fml.common.EnhancedRuntimeException
  "RuntimeException that gives subclasses the simple opportunity to write extra data when printing the stack trace.
  Mainly a helper class as printsStackTrace has multiple signatures."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common EnhancedRuntimeException]))

(defn ->enhanced-runtime-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^EnhancedRuntimeException [^java.lang.String message ^java.lang.Throwable cause]
    (new EnhancedRuntimeException message cause))
  (^EnhancedRuntimeException [^java.lang.String message]
    (new EnhancedRuntimeException message))
  (^EnhancedRuntimeException []
    (new EnhancedRuntimeException )))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^EnhancedRuntimeException this]
    (-> this (.getMessage))))

(defn print-stack-trace
  "s - `java.io.PrintWriter`"
  ([^EnhancedRuntimeException this ^java.io.PrintWriter s]
    (-> this (.printStackTrace s))))

