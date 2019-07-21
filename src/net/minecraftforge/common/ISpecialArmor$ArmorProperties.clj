(ns net.minecraftforge.common.ISpecialArmor$ArmorProperties
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ISpecialArmor$ArmorProperties]))

(defn ->armor-properties
  "Constructor.

  priority - `int`
  ratio - `double`
  max - `int`"
  (^ISpecialArmor$ArmorProperties [^Integer priority ^Double ratio ^Integer max]
    (new ISpecialArmor$ArmorProperties priority ratio max)))

(defn priority
  "Instance Field.

  type: int"
  (^Integer [^ISpecialArmor$ArmorProperties this]
    (-> this .-Priority)))

(defn absorb-max
  "Instance Field.

  type: int"
  (^Integer [^ISpecialArmor$ArmorProperties this]
    (-> this .-AbsorbMax)))

(defn absorb-ratio
  "Instance Field.

  type: double"
  (^Double [^ISpecialArmor$ArmorProperties this]
    (-> this .-AbsorbRatio)))

(defn slot
  "Instance Field.

  type: int"
  (^Integer [^ISpecialArmor$ArmorProperties this]
    (-> this .-Slot)))

(defn *apply-armor
  "Gathers and applies armor reduction to damage being dealt to a entity.

  entity - The Entity being damage - `net.minecraft.entity.EntityLivingBase`
  inventory - An array of armor items - `net.minecraft.util.NonNullList`
  source - The damage source type - `net.minecraft.util.DamageSource`
  damage - The total damage being done - `double`

  returns: The left over damage that has not been absorbed by the armor - `float`"
  (^Float [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.NonNullList inventory ^net.minecraft.util.DamageSource source ^Double damage]
    (ISpecialArmor$ArmorProperties/applyArmor entity inventory source damage)))

(defn compare-to
  "o - `net.minecraftforge.common.ISpecialArmor$ArmorProperties`

  returns: `int`"
  (^Integer [^ISpecialArmor$ArmorProperties this ^net.minecraftforge.common.ISpecialArmor$ArmorProperties o]
    (-> this (.compareTo o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ISpecialArmor$ArmorProperties this]
    (-> this (.toString))))

(defn copy
  "returns: `net.minecraftforge.common.ISpecialArmor$ArmorProperties`"
  (^net.minecraftforge.common.ISpecialArmor$ArmorProperties [^ISpecialArmor$ArmorProperties this]
    (-> this (.copy))))

