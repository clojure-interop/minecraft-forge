(ns net.minecraft.potion.PotionEffect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionEffect]))

(defn ->potion-effect
  "Constructor.

  potion-in - `net.minecraft.potion.Potion`
  duration-in - `int`
  amplifier-in - `int`
  ambient-in - `boolean`
  show-particles-in - `boolean`"
  (^PotionEffect [^net.minecraft.potion.Potion potion-in ^Integer duration-in ^Integer amplifier-in ^Boolean ambient-in ^Boolean show-particles-in]
    (new PotionEffect potion-in duration-in amplifier-in ambient-in show-particles-in))
  (^PotionEffect [^net.minecraft.potion.Potion potion-in ^Integer duration-in ^Integer amplifier-in]
    (new PotionEffect potion-in duration-in amplifier-in))
  (^PotionEffect [^net.minecraft.potion.Potion potion-in ^Integer duration-in]
    (new PotionEffect potion-in duration-in))
  (^PotionEffect [^net.minecraft.potion.Potion potion-in]
    (new PotionEffect potion-in)))

(defn *read-custom-potion-effect-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.potion.PotionEffect`"
  (^net.minecraft.potion.PotionEffect [^net.minecraft.nbt.NBTTagCompound nbt]
    (PotionEffect/readCustomPotionEffectFromNBT nbt)))

(defn get-effect-name
  "returns: `java.lang.String`"
  (^java.lang.String [^PotionEffect this]
    (-> this (.getEffectName))))

(defn get-curative-items
  "Returns a list of curative items for the potion effect

  returns: The list (ItemStack) of curative items for the potion effect - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^PotionEffect this]
    (-> this (.getCurativeItems))))

(defn get-is-ambient?
  "returns: `boolean`"
  (^Boolean [^PotionEffect this]
    (-> this (.getIsAmbient))))

(defn on-update
  "entity-in - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^PotionEffect this ^net.minecraft.entity.EntityLivingBase entity-in]
    (-> this (.onUpdate entity-in))))

(defn get-potion
  "returns: `net.minecraft.potion.Potion`"
  (^net.minecraft.potion.Potion [^PotionEffect this]
    (-> this (.getPotion))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PotionEffect this]
    (-> this (.toString))))

(defn write-custom-potion-effect-to-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^PotionEffect this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.writeCustomPotionEffectToNBT nbt))))

(defn get-amplifier
  "returns: `int`"
  (^Integer [^PotionEffect this]
    (-> this (.getAmplifier))))

(defn get-is-potion-duration-max?
  "returns: `boolean`"
  (^Boolean [^PotionEffect this]
    (-> this (.getIsPotionDurationMax))))

(defn set-curative-items
  "Sets the array of curative items for the potion effect

  curative-items - The list of ItemStacks being set to the potion effect - `java.util.List`"
  ([^PotionEffect this ^java.util.List curative-items]
    (-> this (.setCurativeItems curative-items))))

(defn perform-effect
  "entity-in - `net.minecraft.entity.EntityLivingBase`"
  ([^PotionEffect this ^net.minecraft.entity.EntityLivingBase entity-in]
    (-> this (.performEffect entity-in))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PotionEffect this]
    (-> this (.hashCode))))

(defn set-potion-duration-max
  "max-duration - `boolean`"
  ([^PotionEffect this ^Boolean max-duration]
    (-> this (.setPotionDurationMax max-duration))))

(defn does-show-particles
  "returns: `boolean`"
  (^Boolean [^PotionEffect this]
    (-> this (.doesShowParticles))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.potion.PotionEffect`

  returns: `int`"
  (^Integer [^PotionEffect this ^net.minecraft.potion.PotionEffect p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn combine
  "other - `net.minecraft.potion.PotionEffect`"
  ([^PotionEffect this ^net.minecraft.potion.PotionEffect other]
    (-> this (.combine other))))

(defn get-duration
  "returns: `int`"
  (^Integer [^PotionEffect this]
    (-> this (.getDuration))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PotionEffect this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn curative-item?
  "Checks the given ItemStack to see if it is in the list of curative items for the potion effect

  stack - The ItemStack being checked against the list of curative items for the potion effect - `net.minecraft.item.ItemStack`

  returns: true if the given ItemStack is in the list of curative items for the potion effect, false otherwise - `boolean`"
  (^Boolean [^PotionEffect this ^net.minecraft.item.ItemStack stack]
    (-> this (.isCurativeItem stack))))

(defn add-curative-item
  "Adds the given stack to list of curative items for the potion effect

  stack - The ItemStack being added to the curative item list - `net.minecraft.item.ItemStack`"
  ([^PotionEffect this ^net.minecraft.item.ItemStack stack]
    (-> this (.addCurativeItem stack))))

