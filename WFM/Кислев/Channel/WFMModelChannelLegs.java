// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelChannelLegs extends ModelBase {
	private final ModelRenderer LeftLeg;
	private final ModelRenderer leftLeg_r1;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer RightLeg_r4;
	private final ModelRenderer RightLeg_r5;

	public WFMModelChannelLegs() {
		textureWidth = 64;
		textureHeight = 64;

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setRotationPoint(-1.0F, -1.0F, 0.0F);
		LeftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, 0.0F, 0.0F, 0.48F);
		leftLeg_r1.cubeList.add(new ModelBox(leftLeg_r1, 34, 52, 0.0F, 0.0F, -6.0F, 9, 0, 12, 0.0F, false));

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(2.2F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -3.1165F, 0.7457F, 2.7227F);
		RightLeg_r1.cubeList.add(new ModelBox(RightLeg_r1, 40, 0, -0.0029F, 0.8691F, -6.0F, 6, 12, 6, 0.7F, false));

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, -0.0436F);
		RightLeg_r2.cubeList.add(new ModelBox(RightLeg_r2, 0, 16, -2.0F, 1.0F, -2.0F, 4, 12, 4, 0.7F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, true));

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setRotationPoint(0.8F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, 0.0F, 0.0F, -0.48F);
		RightLeg_r3.cubeList.add(new ModelBox(RightLeg_r3, -12, 52, -9.0F, 0.0F, -6.0F, 9, 0, 12, 0.0F, false));

		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setRotationPoint(-2.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.0F, -0.7854F, 0.4363F);
		RightLeg_r4.cubeList.add(new ModelBox(RightLeg_r4, 20, 46, -0.0029F, 0.8691F, -6.0F, 6, 12, 6, 0.7F, false));

		RightLeg_r5 = new ModelRenderer(this);
		RightLeg_r5.setRotationPoint(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r5);
		setRotationAngle(RightLeg_r5, 0.0F, 0.0F, 0.0436F);
		RightLeg_r5.cubeList.add(new ModelBox(RightLeg_r5, 16, 16, -2.0F, 1.0F, -2.0F, 4, 12, 4, 0.7F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LeftLeg.render(f5);
		RightLeg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}