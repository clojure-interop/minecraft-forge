(ns net.minecraftforge.fluids.capability.CapabilityFluidHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability CapabilityFluidHandler]))

(defn ->capability-fluid-handler
  "Constructor."
  (^CapabilityFluidHandler []
    (new CapabilityFluidHandler )))

(defn *-fluid-handler-capability
  "Static Field.

  type: net.minecraftforge.common.capabilities.Capability<net.minecraftforge.fluids.capability.IFluidHandler>"
  []
  CapabilityFluidHandler/FLUID_HANDLER_CAPABILITY)

(defn *-fluid-handler-item-capability
  "Static Field.

  type: net.minecraftforge.common.capabilities.Capability<net.minecraftforge.fluids.capability.IFluidHandlerItem>"
  []
  CapabilityFluidHandler/FLUID_HANDLER_ITEM_CAPABILITY)

(defn *register
  ""
  ([]
    (CapabilityFluidHandler/register )))

