(ns net.minecraftforge.event.AttachCapabilitiesEvent
  "Fired whenever an object with Capabilities support {currently TileEntity/Item/Entity)
  is created. Allowing for the attachment of arbitrary capability providers.

  Please note that as this is fired for ALL object creations efficient code is recommended.
  And if possible use one of the sub-classes to filter your intended objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event AttachCapabilitiesEvent]))

(defn ->attach-capabilities-event
  "Constructor.

  type - `java.lang.Class`
  obj - `T`"
  (^AttachCapabilitiesEvent [^java.lang.Class type obj]
    (new AttachCapabilitiesEvent type obj))
  (^AttachCapabilitiesEvent [obj]
    (new AttachCapabilitiesEvent obj)))

(defn get-object
  "Retrieves the object that is being created, Not much state is set.

  returns: `T`"
  ([^AttachCapabilitiesEvent this]
    (-> this (.getObject))))

(defn add-capability
  "Adds a capability to be attached to this object.
   Keys MUST be unique, it is suggested that you set the domain to your mod ID.
   If the capability is an instance of INBTSerializable, this key will be used when serializing this capability.

  key - The name of owner of this capability provider. - `net.minecraft.util.ResourceLocation`
  cap - The capability provider - `net.minecraftforge.common.capabilities.ICapabilityProvider`"
  ([^AttachCapabilitiesEvent this ^net.minecraft.util.ResourceLocation key ^net.minecraftforge.common.capabilities.ICapabilityProvider cap]
    (-> this (.addCapability key cap))))

(defn get-capabilities
  "A unmodifiable view of the capabilities that will be attached to this object.

  returns: `java.util.Map<net.minecraft.util.ResourceLocation,net.minecraftforge.common.capabilities.ICapabilityProvider>`"
  (^java.util.Map [^AttachCapabilitiesEvent this]
    (-> this (.getCapabilities))))

