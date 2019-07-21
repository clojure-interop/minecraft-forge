(ns net.minecraftforge.fml.common.LoaderExceptionModCrash
  "Prevent LoaderException from adding its own stack trace to the wrapped throwable's stack trace."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common LoaderExceptionModCrash]))

(defn ->loader-exception-mod-crash
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^LoaderExceptionModCrash [^java.lang.String message ^java.lang.Throwable cause]
    (new LoaderExceptionModCrash message cause)))

(defn fill-in-stack-trace
  "returns: `java.lang.Throwable`"
  (^java.lang.Throwable [^LoaderExceptionModCrash this]
    (-> this (.fillInStackTrace))))

