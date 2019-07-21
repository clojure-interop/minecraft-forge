(ns net.minecraftforge.fml.common.LoaderException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common LoaderException]))

(defn ->loader-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^LoaderException [^java.lang.String message ^java.lang.Throwable cause]
    (new LoaderException message cause))
  (^LoaderException [^java.lang.Throwable wrapped]
    (new LoaderException wrapped))
  (^LoaderException []
    (new LoaderException )))

