// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMmodelOgreBucaneerLegs extends ModelBase {
	private final ModelRenderer leg_right;
	private final ModelRenderer cape_right;
	private final ModelRenderer leg_left;
	private final ModelRenderer cape_left;

	public WFMmodelOgreBucaneerLegs() {
		textureWidth = 128;
		textureHeight = 128;

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-6.0F, 0.0F, 0.0F);
		leg_right.cubeList.add(new ModelBox(leg_right, 0, 78, -5.5F, 0.0F, -6.0F, 11, 12, 12, 0.0F, true));

		cape_right = new ModelRenderer(this);
		cape_right.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right.addChild(cape_right);
		cape_right.cubeList.add(new ModelBox(cape_right, 0, 0, -6.0F, -1.0F, -7.0F, 12, 23, 14, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(6.0F, 0.0F, 0.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 0, 78, -5.5F, 0.0F, -6.0F, 11, 12, 12, 0.0F, false));

		cape_left = new ModelRenderer(this);
		cape_left.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left.addChild(cape_left);
		cape_left.cubeList.add(new ModelBox(cape_left, 76, 0, -6.0F, -1.0F, -7.0F, 12, 23, 14, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leg_right.render(f5);
		leg_left.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}