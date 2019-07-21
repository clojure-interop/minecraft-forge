(ns net.minecraftforge.event.EntitySelectorEvent
  "EntitySelectorEvent is fired whenever Minecraft collects entity selectors.
  This happens (one or multiple times) when you use something like @a[gamemode=1] in a command.
  This event is fired via ForgeEventFactory.gatherEntitySelectors(Map, String, ICommandSender, Vec3d),
  which is executed in EntitySelector.matchEntities(ICommandSender, String, Class)

  This event is not cancelable and does not have a result.

  This event is fired on the MinecraftForge.EVENT_BUS"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event EntitySelectorEvent]))

(defn ->entity-selector-event
  "Constructor.

  map - `java.util.Map`
  main-selector - `java.lang.String`
  sender - `net.minecraft.command.ICommandSender`
  position - `net.minecraft.util.math.Vec3d`"
  (^EntitySelectorEvent [^java.util.Map map ^java.lang.String main-selector ^net.minecraft.command.ICommandSender sender ^net.minecraft.util.math.Vec3d position]
    (new EntitySelectorEvent map main-selector sender position)))

(defn add-predicate
  "Add your custom selector.
   It is recommend to use \"modid:name\", if checking for own arguments, to avoid inter-mod interference (e.g.  \"@a[Forge:timeplayed=100]\").

  selector - Your custom predicate - `com.google.common.base.Predicate`"
  ([^EntitySelectorEvent this ^com.google.common.base.Predicate selector]
    (-> this (.addPredicate selector))))

(defn get-main-selector
  "returns: The main selector used (e.g. 'a' for all players or 'e' for all entities) - `java.lang.String`"
  (^java.lang.String [^EntitySelectorEvent this]
    (-> this (.getMainSelector))))

(defn get-argument-map
  "Example: \"@a[test=true]\" would result in a map with \"test\"=>\"true\"

  returns: The argument map. Maps all given argument names with its value. - `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^EntitySelectorEvent this]
    (-> this (.getArgumentMap))))

(defn get-position
  "See EntitySelector.getPosFromArguments(Map, Vec3d)

  returns: A position either specified in the selector arguments or by the players position. - `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^EntitySelectorEvent this]
    (-> this (.getPosition))))

(defn get-sender
  "returns: The sender of the command. - `net.minecraft.command.ICommandSender`"
  (^net.minecraft.command.ICommandSender [^EntitySelectorEvent this]
    (-> this (.getSender))))

