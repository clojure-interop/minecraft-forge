(ns net.minecraftforge.fml.common.launcher.Yggdrasil
  "Basic implementation of Mojang's 'Yggdrasil' login system, purely intended as a dev time bare bones login.
  Login errors are not handled."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.launcher Yggdrasil]))

(defn ->yggdrasil
  "Constructor."
  (^Yggdrasil []
    (new Yggdrasil )))

(defn *login
  "args - `java.util.Map`"
  ([^java.util.Map args]
    (Yggdrasil/login args)))

