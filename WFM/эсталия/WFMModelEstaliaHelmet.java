// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelEstaliaHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer group;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer feather;

	public WFMModelEstaliaHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 24.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 17).addBox(-2.5F, -11.0779F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		head.texOffs(38, 18).addBox(-0.5F, -12.0779F, -5.7576F, 1.0F, 7.5F, 12.0F, 0.0F, false);
		head.texOffs(28, 17).addBox(-0.5F, -15.0779F, -4.7576F, 1.0F, 3.0F, 10.0F, 0.0F, false);
		head.texOffs(0, 35).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		group = new ModelRenderer(this);
		group.setPos(0.0F, -4.0F, 4.0F);
		head.addChild(group);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.35F, -8.0F);
		group.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.8706F, 0.5724F, -0.5713F);
		cube_r1.texOffs(0, 45).addBox(-4.0F, -0.5F, -5.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(3.5F, -0.5779F, -3.5076F);
		group.addChild(head_r1);
		setRotationAngle(head_r1, 0.0098F, 0.0403F, 0.4784F);
		head_r1.texOffs(0, 25).addBox(0.5F, -0.5F, -5.0F, 3.0F, 1.0F, 9.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(-3.5F, -0.5779F, -3.5076F);
		group.addChild(head_r2);
		setRotationAngle(head_r2, 0.0098F, -0.0403F, -0.4784F);
		head_r2.texOffs(0, 25).addBox(-3.5F, -0.5F, -5.0F, 3.0F, 1.0F, 9.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.75F, 0.0F);
		group.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.8706F, -0.5724F, -0.5713F);
		cube_r2.texOffs(28, 43).addBox(-4.0F, -0.5F, -4.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

		feather = new ModelRenderer(this);
		feather.setPos(-3.5959F, -7.1319F, -0.5772F);
		head.addChild(feather);
		setRotationAngle(feather, -0.2182F, -0.6109F, 0.0F);
		feather.texOffs(42, 42).addBox(0.0F, -11.0F, -1.0F, 0.0F, 11.0F, 11.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}