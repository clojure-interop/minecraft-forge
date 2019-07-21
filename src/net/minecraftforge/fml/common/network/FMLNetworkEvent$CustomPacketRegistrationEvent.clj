(ns net.minecraftforge.fml.common.network.FMLNetworkEvent$CustomPacketRegistrationEvent
  "Fired when the REGISTER/UNREGISTER for custom channels is received."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent$CustomPacketRegistrationEvent]))

(defn ->custom-packet-registration-event
  "Constructor.

  manager - `net.minecraft.network.NetworkManager`
  registrations - `java.util.Set`
  operation - `java.lang.String`
  side - `net.minecraftforge.fml.relauncher.Side`
  type - `java.lang.Class`"
  (^FMLNetworkEvent$CustomPacketRegistrationEvent [^net.minecraft.network.NetworkManager manager ^java.util.Set registrations ^java.lang.String operation ^net.minecraftforge.fml.relauncher.Side side ^java.lang.Class type]
    (new FMLNetworkEvent$CustomPacketRegistrationEvent manager registrations operation side type)))

(defn get-registrations
  "returns: `com.google.common.collect.ImmutableSet<java.lang.String>`"
  (^com.google.common.collect.ImmutableSet [^FMLNetworkEvent$CustomPacketRegistrationEvent this]
    (-> this (.getRegistrations))))

(defn get-operation
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLNetworkEvent$CustomPacketRegistrationEvent this]
    (-> this (.getOperation))))

(defn get-side
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLNetworkEvent$CustomPacketRegistrationEvent this]
    (-> this (.getSide))))

