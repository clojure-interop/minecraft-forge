(ns net.minecraftforge.energy.EnergyStorage
  "Reference implementation of IEnergyStorage. Use/extend this or implement your own.

  Derived from the Redstone Flux power system designed by King Lemming and originally utilized in Thermal Expansion and related mods.
  Created with consent and permission of King Lemming and Team CoFH. Released with permission under LGPL 2.1 when bundled with Forge."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.energy EnergyStorage]))

(defn ->energy-storage
  "Constructor.

  capacity - `int`
  max-receive - `int`
  max-extract - `int`"
  (^EnergyStorage [^Integer capacity ^Integer max-receive ^Integer max-extract]
    (new EnergyStorage capacity max-receive max-extract))
  (^EnergyStorage [^Integer capacity ^Integer max-transfer]
    (new EnergyStorage capacity max-transfer))
  (^EnergyStorage [^Integer capacity]
    (new EnergyStorage capacity)))

(defn receive-energy
  "Description copied from interface: IEnergyStorage

  max-receive - Maximum amount of energy to be inserted. - `int`
  simulate - If TRUE, the insertion will only be simulated. - `boolean`

  returns: Amount of energy that was (or would have been, if simulated) accepted by the storage. - `int`"
  (^Integer [^EnergyStorage this ^Integer max-receive ^Boolean simulate]
    (-> this (.receiveEnergy max-receive simulate))))

(defn extract-energy
  "Description copied from interface: IEnergyStorage

  max-extract - Maximum amount of energy to be extracted. - `int`
  simulate - If TRUE, the extraction will only be simulated. - `boolean`

  returns: Amount of energy that was (or would have been, if simulated) extracted from the storage. - `int`"
  (^Integer [^EnergyStorage this ^Integer max-extract ^Boolean simulate]
    (-> this (.extractEnergy max-extract simulate))))

(defn get-energy-stored
  "Description copied from interface: IEnergyStorage

  returns: `int`"
  (^Integer [^EnergyStorage this]
    (-> this (.getEnergyStored))))

(defn get-max-energy-stored
  "Description copied from interface: IEnergyStorage

  returns: `int`"
  (^Integer [^EnergyStorage this]
    (-> this (.getMaxEnergyStored))))

(defn can-extract?
  "Description copied from interface: IEnergyStorage

  returns: `boolean`"
  (^Boolean [^EnergyStorage this]
    (-> this (.canExtract))))

(defn can-receive?
  "Description copied from interface: IEnergyStorage

  returns: `boolean`"
  (^Boolean [^EnergyStorage this]
    (-> this (.canReceive))))

