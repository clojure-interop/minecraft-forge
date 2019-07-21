(ns net.minecraftforge.fml.repackage.com.nothome.delta.PatchException
  "Thrown when a patch is invalid."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta PatchException]))

(defn ->patch-exception
  "Constructor.

  Constructs an instance of PatchException with the specified detail message.

  msg - the detail message. - `java.lang.String`"
  (^PatchException [^java.lang.String msg]
    (new PatchException msg))
  (^PatchException []
    (new PatchException )))

