(ns net.minecraftforge.energy.IEnergyStorage
  "An energy storage is the unit of interaction with Energy inventories.

  A reference implementation can be found at EnergyStorage.

  Derived from the Redstone Flux power system designed by King Lemming and originally utilized in Thermal Expansion and related mods.
  Created with consent and permission of King Lemming and Team CoFH. Released with permission under LGPL 2.1 when bundled with Forge."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.energy IEnergyStorage]))

(defn receive-energy
  "Adds energy to the storage. Returns quantity of energy that was accepted.

  max-receive - Maximum amount of energy to be inserted. - `int`
  simulate - If TRUE, the insertion will only be simulated. - `boolean`

  returns: Amount of energy that was (or would have been, if simulated) accepted by the storage. - `int`"
  (^Integer [^IEnergyStorage this ^Integer max-receive ^Boolean simulate]
    (-> this (.receiveEnergy max-receive simulate))))

(defn extract-energy
  "Removes energy from the storage. Returns quantity of energy that was removed.

  max-extract - Maximum amount of energy to be extracted. - `int`
  simulate - If TRUE, the extraction will only be simulated. - `boolean`

  returns: Amount of energy that was (or would have been, if simulated) extracted from the storage. - `int`"
  (^Integer [^IEnergyStorage this ^Integer max-extract ^Boolean simulate]
    (-> this (.extractEnergy max-extract simulate))))

(defn get-energy-stored
  "Returns the amount of energy currently stored.

  returns: `int`"
  (^Integer [^IEnergyStorage this]
    (-> this (.getEnergyStored))))

(defn get-max-energy-stored
  "Returns the maximum amount of energy that can be stored.

  returns: `int`"
  (^Integer [^IEnergyStorage this]
    (-> this (.getMaxEnergyStored))))

(defn can-extract?
  "Returns if this storage can have energy extracted.
   If this is false, then any calls to extractEnergy will return 0.

  returns: `boolean`"
  (^Boolean [^IEnergyStorage this]
    (-> this (.canExtract))))

(defn can-receive?
  "Used to determine if this storage can receive energy.
   If this is false, then any calls to receiveEnergy will return 0.

  returns: `boolean`"
  (^Boolean [^IEnergyStorage this]
    (-> this (.canReceive))))

