// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelCorpseonStake extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer stake;
	private final ModelRenderer head;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_right;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_left;

	public WFMModelCorpseonStake() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 3.0F, 0.0F);
		setRotationAngle(body, -0.9163F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, -8.435F, -5.1734F, 8, 12, 4, 0.0F, false));

		stake = new ModelRenderer(this);
		stake.setRotationPoint(0.0F, 24.0F, 0.0F);
		stake.cubeList.add(new ModelBox(stake, 56, 27, -1.0F, -35.0F, -1.0F, 2, 35, 2, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -3.0F, 8.0F);
		setRotationAngle(head, -0.9163F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 32, 0, -4.0F, -6.435F, -7.1734F, 8, 8, 8, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(6.0F, 5.0F, 3.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 40, 16, -2.0F, -10.0F, -2.0F, 4, 12, 4, 0.0F, true));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-6.0F, 5.0F, 3.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 40, 16, -2.0F, -10.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-1.9F, 8.0F, -6.0F);
		setRotationAngle(leg_right, -1.4094F, -1.3055F, 1.4037F);
		leg_right.cubeList.add(new ModelBox(leg_right, 0, 16, -2.0F, -6.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(2.1F, 12.0F, -6.0F);
		setRotationAngle(leg_left, -0.2618F, 0.0F, 0.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 0, 16, -2.0F, -9.8637F, -3.0353F, 4, 12, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		stake.render(f5);
		head.render(f5);
		hand_left.render(f5);
		hand_right.render(f5);
		leg_right.render(f5);
		leg_left.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}