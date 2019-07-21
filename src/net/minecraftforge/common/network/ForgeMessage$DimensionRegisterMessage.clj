(ns net.minecraftforge.common.network.ForgeMessage$DimensionRegisterMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.network ForgeMessage$DimensionRegisterMessage]))

(defn ->dimension-register-message
  "Constructor.

  dimension-id - `int`
  provider-id - `java.lang.String`"
  (^ForgeMessage$DimensionRegisterMessage [^Integer dimension-id ^java.lang.String provider-id]
    (new ForgeMessage$DimensionRegisterMessage dimension-id provider-id))
  (^ForgeMessage$DimensionRegisterMessage []
    (new ForgeMessage$DimensionRegisterMessage )))

