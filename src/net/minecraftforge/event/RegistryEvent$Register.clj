(ns net.minecraftforge.event.RegistryEvent$Register
  "Register your objects for the appropriate registry type when you receive this event.

  event.getRegistry().register(...)

  The registries will be visited in alphabetic order of their name, except blocks and items,
  which will be visited FIRST and SECOND respectively.

  ObjectHolders will reload between Blocks and Items, and after all registries have been visited."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event RegistryEvent$Register]))

(defn ->register
  "Constructor.

  location - `net.minecraft.util.ResourceLocation`
  registry - `net.minecraftforge.fml.common.registry.IForgeRegistry`"
  (^RegistryEvent$Register [^net.minecraft.util.ResourceLocation location ^net.minecraftforge.fml.common.registry.IForgeRegistry registry]
    (new RegistryEvent$Register location registry)))

(defn get-registry
  "returns: `net.minecraftforge.fml.common.registry.IForgeRegistry<T>`"
  (^net.minecraftforge.fml.common.registry.IForgeRegistry [^RegistryEvent$Register this]
    (-> this (.getRegistry))))

(defn get-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^RegistryEvent$Register this]
    (-> this (.getLocation))))

