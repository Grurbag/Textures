// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelSkinWolfClaws extends ModelBase {
	private final ModelRenderer hand;
	private final ModelRenderer claw;
	private final ModelRenderer claw2;
	private final ModelRenderer claw3;

	public WFMModelSkinWolfClaws() {
		textureWidth = 64;
		textureHeight = 32;

		hand = new ModelRenderer(this);
		hand.setRotationPoint(0.866F, -16.7679F, -4.0F);
		hand.cubeList.add(new ModelBox(hand, 0, 0, 0.0F, 10.0F, -4.0F, 7, 7, 7, 0.0F, false));

		claw = new ModelRenderer(this);
		claw.setRotationPoint(0.0F, 9.0F, -8.0F);
		hand.addChild(claw);
		setRotationAngle(claw, 0.0F, 0.1745F, 0.0F);
		claw.cubeList.add(new ModelBox(claw, 0, 10, 0.0F, -5.0F, -7.0F, 0, 10, 12, 0.0F, false));

		claw2 = new ModelRenderer(this);
		claw2.setRotationPoint(4.0F, 9.0F, -8.0F);
		hand.addChild(claw2);
		claw2.cubeList.add(new ModelBox(claw2, 0, 10, -0.366F, -5.0F, -7.0F, 0, 10, 12, 0.0F, false));

		claw3 = new ModelRenderer(this);
		claw3.setRotationPoint(8.0F, 9.0F, -8.0F);
		hand.addChild(claw3);
		setRotationAngle(claw3, 0.0F, -0.1745F, 0.0F);
		claw3.cubeList.add(new ModelBox(claw3, 0, 10, -0.866F, -5.0F, -7.0F, 0, 10, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hand.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}