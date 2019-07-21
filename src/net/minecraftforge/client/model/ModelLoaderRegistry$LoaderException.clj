(ns net.minecraftforge.client.model.ModelLoaderRegistry$LoaderException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ModelLoaderRegistry$LoaderException]))

(defn ->loader-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^ModelLoaderRegistry$LoaderException [^java.lang.String message ^java.lang.Throwable cause]
    (new ModelLoaderRegistry$LoaderException message cause))
  (^ModelLoaderRegistry$LoaderException [^java.lang.String message]
    (new ModelLoaderRegistry$LoaderException message)))

