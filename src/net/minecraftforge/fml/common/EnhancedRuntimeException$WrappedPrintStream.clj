(ns net.minecraftforge.fml.common.EnhancedRuntimeException$WrappedPrintStream
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common EnhancedRuntimeException$WrappedPrintStream]))

(defn ->wrapped-print-stream
  "Constructor."
  (^EnhancedRuntimeException$WrappedPrintStream []
    (new EnhancedRuntimeException$WrappedPrintStream )))

(defn println
  "line - `java.lang.String`"
  ([^EnhancedRuntimeException$WrappedPrintStream this ^java.lang.String line]
    (-> this (.println line))))

