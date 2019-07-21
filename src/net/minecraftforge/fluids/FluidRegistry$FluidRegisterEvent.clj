(ns net.minecraftforge.fluids.FluidRegistry$FluidRegisterEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidRegistry$FluidRegisterEvent]))

(defn ->fluid-register-event
  "Constructor.

  fluid-name - `java.lang.String`
  fluid-id - `int`"
  (^FluidRegistry$FluidRegisterEvent [^java.lang.String fluid-name ^Integer fluid-id]
    (new FluidRegistry$FluidRegisterEvent fluid-name fluid-id)))

(defn get-fluid-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FluidRegistry$FluidRegisterEvent this]
    (-> this (.getFluidName))))

(defn get-fluid-id
  "returns: `int`"
  (^Integer [^FluidRegistry$FluidRegisterEvent this]
    (-> this (.getFluidID))))

