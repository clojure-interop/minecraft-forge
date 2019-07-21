(ns net.minecraft.entity.item.EntityItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityItem]))

(defn ->entity-item
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  stack - `net.minecraft.item.ItemStack`"
  (^EntityItem [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^net.minecraft.item.ItemStack stack]
    (new EntityItem world-in x y z stack))
  (^EntityItem [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityItem world-in x y z))
  (^EntityItem [^net.minecraft.world.World world-in]
    (new EntityItem world-in)))

(defn hover-start
  "Instance Field.

  type: float"
  (^Float [^EntityItem this]
    (-> this .-hoverStart)))

(defn lifespan
  "Instance Field.

  The maximum age of this EntityItem.  The item is expired once this is reached.

  type: int"
  (^Integer [^EntityItem this]
    (-> this .-lifespan)))

(defn *register-fixes-item
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityItem/registerFixesItem fixer)))

(defn make-fake-item
  ""
  ([^EntityItem this]
    (-> this (.makeFakeItem))))

(defn set-owner
  "owner - `java.lang.String`"
  ([^EntityItem this ^java.lang.String owner]
    (-> this (.setOwner owner))))

(defn on-update
  ""
  ([^EntityItem this]
    (-> this (.onUpdate))))

(defn set-pickup-delay
  "ticks - `int`"
  ([^EntityItem this ^Integer ticks]
    (-> this (.setPickupDelay ticks))))

(defn set-no-pickup-delay
  ""
  ([^EntityItem this]
    (-> this (.setNoPickupDelay))))

(defn can-be-attacked-with-item?
  "returns: `boolean`"
  (^Boolean [^EntityItem this]
    (-> this (.canBeAttackedWithItem))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityItem this]
    (-> this (.getName))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityItem this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn set-infinite-pickup-delay
  ""
  ([^EntityItem this]
    (-> this (.setInfinitePickupDelay))))

(defn set-age-to-creative-despawn-time
  ""
  ([^EntityItem this]
    (-> this (.setAgeToCreativeDespawnTime))))

(defn set-entity-item-stack
  "stack - `net.minecraft.item.ItemStack`"
  ([^EntityItem this ^net.minecraft.item.ItemStack stack]
    (-> this (.setEntityItemStack stack))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityItem this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-thrower
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityItem this]
    (-> this (.getThrower))))

(defn get-owner
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityItem this]
    (-> this (.getOwner))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityItem this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn set-default-pickup-delay
  ""
  ([^EntityItem this]
    (-> this (.setDefaultPickupDelay))))

(defn set-no-despawn
  ""
  ([^EntityItem this]
    (-> this (.setNoDespawn))))

(defn handle-water-movement
  "returns: `boolean`"
  (^Boolean [^EntityItem this]
    (-> this (.handleWaterMovement))))

(defn get-age
  "returns: `int`"
  (^Integer [^EntityItem this]
    (-> this (.getAge))))

(defn get-entity-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityItem this]
    (-> this (.getEntityItem))))

(defn cannot-pickup
  "returns: `boolean`"
  (^Boolean [^EntityItem this]
    (-> this (.cannotPickup))))

(defn on-collide-with-player
  "entity-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^EntityItem this ^net.minecraft.entity.player.EntityPlayer entity-in]
    (-> this (.onCollideWithPlayer entity-in))))

(defn set-thrower
  "thrower - `java.lang.String`"
  ([^EntityItem this ^java.lang.String thrower]
    (-> this (.setThrower thrower))))

(defn change-dimension
  "dimension-in - `int`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityItem this ^Integer dimension-in]
    (-> this (.changeDimension dimension-in))))

