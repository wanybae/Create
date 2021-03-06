package com.simibubi.create.modules.contraptions.components.saw;

import com.simibubi.create.foundation.behaviour.ValueBoxTransform;
import com.simibubi.create.foundation.utility.VecHelper;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;

public class SawFilterSlot extends ValueBoxTransform {

	@Override
	protected Vec3d getLocation(BlockState state) {
		if (state.get(SawBlock.FACING) != Direction.UP)
			return null;
		Vec3d x = VecHelper.voxelSpace(8f, 12.5f, 12.25f);
		Vec3d z = VecHelper.voxelSpace(12.25f, 12.5f, 8f);
		return state.get(SawBlock.AXIS_ALONG_FIRST_COORDINATE) ? z : x;
	}

	@Override
	protected Vec3d getOrientation(BlockState state) {
		return new Vec3d(0, state.get(SawBlock.AXIS_ALONG_FIRST_COORDINATE) ? 270 : 180, 90);
	}
	
}
