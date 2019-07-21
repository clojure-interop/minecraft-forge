(ns net.minecraft.client.AnvilConverterException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client AnvilConverterException]))

(defn ->anvil-converter-exception
  "Constructor.

  exception-message - `java.lang.String`"
  (^AnvilConverterException [^java.lang.String exception-message]
    (new AnvilConverterException exception-message)))

