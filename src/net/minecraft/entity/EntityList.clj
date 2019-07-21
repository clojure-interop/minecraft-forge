(ns net.minecraft.entity.EntityList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityList]))

(defn ->entity-list
  "Constructor."
  (^EntityList []
    (new EntityList )))

(def *-lightning-bolt
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  EntityList/LIGHTNING_BOLT)

(def *-entity-eggs
  "Static Constant.

  type: java.util.Map<net.minecraft.util.ResourceLocation,net.minecraft.entity.EntityList$EntityEggInfo>"
  EntityList/ENTITY_EGGS)

(defn *matching-name?
  "entity-in - `net.minecraft.entity.Entity`
  entity-name - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.Entity entity-in ^net.minecraft.util.ResourceLocation entity-name]
    (EntityList/isMatchingName entity-in entity-name)))

(defn *create-entity-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`
  world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^net.minecraft.nbt.NBTTagCompound nbt ^net.minecraft.world.World world-in]
    (EntityList/createEntityFromNBT nbt world-in)))

(defn *create-entity-by-id
  "entity-id - `int`
  world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^Integer entity-id ^net.minecraft.world.World world-in]
    (EntityList/createEntityByID entity-id world-in)))

(defn *get-key
  "entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^net.minecraft.entity.Entity entity-in]
    (EntityList/getKey entity-in)))

(defn *new-entity
  "p-191304-0 - `java.lang.Class`
  p-191304-1 - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^java.lang.Class p-191304-0 ^net.minecraft.world.World p-191304-1]
    (EntityList/newEntity p-191304-0 p-191304-1)))

(defn *get-entity-name-list
  "returns: `java.util.Set<net.minecraft.util.ResourceLocation>`"
  (^java.util.Set []
    (EntityList/getEntityNameList )))

(defn *get-translation-name
  "p-191302-0 - `net.minecraft.util.ResourceLocation`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.util.ResourceLocation p-191302-0]
    (EntityList/getTranslationName p-191302-0)))

(defn *registered?
  "entity-name - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^net.minecraft.util.ResourceLocation entity-name]
    (EntityList/isRegistered entity-name)))

(defn *get-entity-string
  "entity-in - `net.minecraft.entity.Entity`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.entity.Entity entity-in]
    (EntityList/getEntityString entity-in)))

(defn *create-entity-by-id-from-name
  "name - `net.minecraft.util.ResourceLocation`
  world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^net.minecraft.util.ResourceLocation name ^net.minecraft.world.World world-in]
    (EntityList/createEntityByIDFromName name world-in)))

(defn *init
  ""
  ([]
    (EntityList/init )))

(defn *get-id
  "cls - `java.lang.Class`

  returns: `int`"
  (^Integer [^java.lang.Class cls]
    (EntityList/getID cls)))

(defn *get-class-from-id
  "entity-id - `int`

  returns: `java.lang.Class<? extends net.minecraft.entity.Entity>`"
  ([^Integer entity-id]
    (EntityList/getClassFromID entity-id)))

(defn *get-class
  "key - `net.minecraft.util.ResourceLocation`

  returns: `java.lang.Class<? extends net.minecraft.entity.Entity>`"
  ([^net.minecraft.util.ResourceLocation key]
    (EntityList/getClass key)))

