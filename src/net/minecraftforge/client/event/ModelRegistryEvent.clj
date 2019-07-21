(ns net.minecraftforge.client.event.ModelRegistryEvent
  "Fired when the ModelLoader is ready to receive registrations"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event ModelRegistryEvent]))

(defn ->model-registry-event
  "Constructor."
  (^ModelRegistryEvent []
    (new ModelRegistryEvent )))

