(ns net.minecraft.command.EntitySelector
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command EntitySelector]))

(defn ->entity-selector
  "Constructor."
  (^EntitySelector []
    (new EntitySelector )))

(defn *match-one-player
  "sender - `net.minecraft.command.ICommandSender`
  token - `java.lang.String`

  returns: `net.minecraft.entity.player.EntityPlayerMP`

  throws: net.minecraft.command.CommandException"
  (^net.minecraft.entity.player.EntityPlayerMP [^net.minecraft.command.ICommandSender sender ^java.lang.String token]
    (EntitySelector/matchOnePlayer sender token)))

(defn *match-one-entity
  "sender - `net.minecraft.command.ICommandSender`
  token - `java.lang.String`
  target-class - `java.lang.Class`

  returns: `<T extends net.minecraft.entity.Entity> T`

  throws: net.minecraft.command.CommandException"
  ([^net.minecraft.command.ICommandSender sender ^java.lang.String token ^java.lang.Class target-class]
    (EntitySelector/matchOneEntity sender token target-class)))

(defn *match-entities-to-text-component
  "sender - `net.minecraft.command.ICommandSender`
  token - `java.lang.String`

  returns: `net.minecraft.util.text.ITextComponent`

  throws: net.minecraft.command.CommandException"
  (^net.minecraft.util.text.ITextComponent [^net.minecraft.command.ICommandSender sender ^java.lang.String token]
    (EntitySelector/matchEntitiesToTextComponent sender token)))

(defn *match-entities
  "sender - `net.minecraft.command.ICommandSender`
  token - `java.lang.String`
  target-class - `java.lang.Class`

  returns: `<T extends net.minecraft.entity.Entity> java.util.List<T>`

  throws: net.minecraft.command.CommandException"
  ([^net.minecraft.command.ICommandSender sender ^java.lang.String token ^java.lang.Class target-class]
    (EntitySelector/matchEntities sender token target-class)))

(defn *get-score-map
  "params - `java.util.Map`

  returns: `java.util.Map<java.lang.String,java.lang.Integer>`"
  (^java.util.Map [^java.util.Map params]
    (EntitySelector/getScoreMap params)))

(defn *matches-multiple-players
  "selector-str - `java.lang.String`

  returns: `boolean`

  throws: net.minecraft.command.CommandException"
  (^Boolean [^java.lang.String selector-str]
    (EntitySelector/matchesMultiplePlayers selector-str)))

(defn *selector?
  "selector-str - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String selector-str]
    (EntitySelector/isSelector selector-str)))

