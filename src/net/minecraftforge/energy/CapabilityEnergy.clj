(ns net.minecraftforge.energy.CapabilityEnergy
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.energy CapabilityEnergy]))

(defn ->capability-energy
  "Constructor."
  (^CapabilityEnergy []
    (new CapabilityEnergy )))

(defn *-energy
  "Static Field.

  type: net.minecraftforge.common.capabilities.Capability<net.minecraftforge.energy.IEnergyStorage>"
  []
  CapabilityEnergy/ENERGY)

(defn *register
  ""
  ([]
    (CapabilityEnergy/register )))

