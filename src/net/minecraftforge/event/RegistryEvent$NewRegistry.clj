(ns net.minecraftforge.event.RegistryEvent$NewRegistry
  "Register new registries when you receive this event, through the PersistentRegistryManager"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event RegistryEvent$NewRegistry]))

(defn ->new-registry
  "Constructor."
  (^RegistryEvent$NewRegistry []
    (new RegistryEvent$NewRegistry )))

