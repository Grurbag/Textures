// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelParravonKnightLegs extends ModelBase {
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer head_r1;

	public WFMModelParravonKnightLegs() {
		textureWidth = 64;
		textureHeight = 64;

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, true));

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, -0.0436F);
		RightLeg_r1.cubeList.add(new ModelBox(RightLeg_r1, 0, 0, -2.0F, 1.0F, -2.0F, 4, 12, 4, 0.7F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.0436F);
		RightLeg_r2.cubeList.add(new ModelBox(RightLeg_r2, 0, 35, -2.0F, 1.0F, -2.0F, 4, 12, 4, 0.7F, true));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(1.9F, -20.3279F, 0.9924F);
		RightLeg.addChild(head_r1);
		setRotationAngle(head_r1, 2.3661F, 0.688F, 2.1023F);
		head_r1.cubeList.add(new ModelBox(head_r1, 52, 0, 16.5F, 11.4F, -6.5F, 3, 3, 3, -0.1F, false));
		head_r1.cubeList.add(new ModelBox(head_r1, 55, 3, 14.5F, 12.4F, -5.5F, 3, 1, 1, -0.1F, false));
		head_r1.cubeList.add(new ModelBox(head_r1, 52, 0, 14.3F, 11.4F, -6.5F, 1, 3, 3, -0.1F, false));
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