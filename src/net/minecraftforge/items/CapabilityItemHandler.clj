(ns net.minecraftforge.items.CapabilityItemHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items CapabilityItemHandler]))

(defn ->capability-item-handler
  "Constructor."
  (^CapabilityItemHandler []
    (new CapabilityItemHandler )))

(defn *-item-handler-capability
  "Static Field.

  type: net.minecraftforge.common.capabilities.Capability<net.minecraftforge.items.IItemHandler>"
  []
  CapabilityItemHandler/ITEM_HANDLER_CAPABILITY)

(defn *register
  ""
  ([]
    (CapabilityItemHandler/register )))

