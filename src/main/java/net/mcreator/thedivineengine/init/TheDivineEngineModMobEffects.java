/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedivineengine.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.thedivineengine.potion.TheDivineEngineEffectMobEffect;
import net.mcreator.thedivineengine.TheDivineEngineMod;

public class TheDivineEngineModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, TheDivineEngineMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> THE_DIVINE_ENGINE_EFFECT = REGISTRY.register("the_divine_engine_effect", () -> new TheDivineEngineEffectMobEffect());
}